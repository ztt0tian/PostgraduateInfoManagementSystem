var RSAPublicKey = function($modulus, $encryptionExponent) {
    this.modulus = new BigInteger(Hex.encode($modulus), 16);
    this.encryptionExponent = parseInt(Hex.encode($encryptionExponent), 16);
}
var _BASE64 = {
	BASE64_MAPPING: "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",
	toBinary:function(ascii){
		var binary = new Array();
		while(ascii > 0){
			var b = ascii%2;
			ascii = Math.floor(ascii/2);
			binary.push(b);
		}
		binary.reverse();
		return binary;
	},
	toDecimal:function(binary){
		var dec = 0;
		var p = 0;
		for(var i=binary.length-1;i>=0;--i){
			var b=binary[i];
			if(b==1){
				dec += Math.pow(2, p);
			}
			++p;
		}
		return dec;
	},
	toUTF8Binary:function(c, binaryArray){
		var mustLen = (8-(c+1)) + ((c-1)*6);
		var fatLen = binaryArray.length;
		var diff = mustLen - fatLen;
		while(--diff >= 0){
			binaryArray.unshift(0);
		}
		var binary = [];
		var _c = c;
		while(--_c >= 0){
			binary.push(1);
		}
		binary.push(0);
		var i = 0 , len = 8 - (c+1);
		for(; i < len ; ++i){
			binary.push(binaryArray[i]);
		}

		for(var j = 0 ; j < c-1 ; ++j){
			binary.push(1);
			binary.push(0);
			var sum = 6;
			while(--sum >= 0){
				binary.push(binaryArray[i++]);
			}
		}
		return binary;
	},
	encode:function(str){
		var base64_Index = [];
		var binaryArray = [];
		for(var i = 0 , len = str.length ; i < len ; ++i){
			var unicode = str.charCodeAt(i);
			var _tmpBinary = this.toBinary(unicode);
			if(unicode < 0x80){
				var _tmpdiff = 8 - _tmpBinary.length;
				while(--_tmpdiff >= 0){
					_tmpBinary.unshift(0);
				}
				binaryArray = binaryArray.concat(_tmpBinary);
			}else if(unicode >= 0x80 && unicode <= 0x7FF){
				binaryArray = binaryArray.concat(this.toUTF8Binary(2 , _tmpBinary));
			}else if(unicode >= 0x800 && unicode <= 0xFFFF){//UTF-8 3byte
				binaryArray = binaryArray.concat(this.toUTF8Binary(3 , _tmpBinary));
			}else if(unicode >= 0x10000 && unicode <= 0x1FFFFF){//UTF-8 4byte
				binaryArray = binaryArray.concat(this.toUTF8Binary(4 , _tmpBinary));	
			}else if(unicode >= 0x200000 && unicode <= 0x3FFFFFF){//UTF-8 5byte
				binaryArray = binaryArray.concat(this.toUTF8Binary(5 , _tmpBinary));
			}else if(unicode >= 4000000 && unicode <= 0x7FFFFFFF){//UTF-8 6byte
				binaryArray = binaryArray.concat(this.toUTF8Binary(6 , _tmpBinary));
			}
		}

		var extra_Zero_Count = 0;
		for(var i = 0 , len = binaryArray.length ; i < len ; i+=6){
			var diff = (i+6)-len;
			if(diff == 2){
				extra_Zero_Count = 2;
			}else if(diff == 4){
				extra_Zero_Count = 4;
			}
			var _tmpExtra_Zero_Count = extra_Zero_Count;
			while(--_tmpExtra_Zero_Count >= 0){
				binaryArray.push(0);
			}
			base64_Index.push(this.toDecimal(binaryArray.slice(i , i+6)));
		}

		var base64 = '';
		for(var i = 0 , len = base64_Index.length ; i < len ; ++i){
			base64 += this.BASE64_MAPPING.charAt(base64_Index[i]);
		}

		for(var i = 0 , len = extra_Zero_Count/2 ; i < len ; ++i){
			base64 += '=';
		}
		return base64;
	},
	decode:function(_base64Str){
		var _len = _base64Str.length;
		var extra_Zero_Count = 0;
		if(_base64Str.charAt(_len-1) == '='){
			if(_base64Str.charAt(_len-2) == '='){
				extra_Zero_Count = 4;
				_base64Str = _base64Str.substring(0 , _len-2);
			}else{
				extra_Zero_Count = 2;
				_base64Str = _base64Str.substring(0 , _len - 1);
			}
		}

		var binaryArray = [];
		for(var i = 0 , len = _base64Str.length; i < len ; ++i){
			var c = _base64Str.charAt(i);
			for(var j = 0 , size = BASE64_MAPPING.length ; j < size ; ++j){
				if(c == BASE64_MAPPING[j]){
					var _tmp = this.toBinary(j);
					var _tmpLen = _tmp.length;
					if(6-_tmpLen > 0){
						for(var k = 6-_tmpLen ; k > 0 ; --k){
							_tmp.unshift(0);
						}
					}
					binaryArray = binaryArray.concat(_tmp);
					break;
				}
			}
		}
		if(extra_Zero_Count > 0){
			binaryArray = binaryArray.slice(0 , binaryArray.length - extra_Zero_Count);
		}
		var unicode = [];
		var unicodeBinary = [];
		for(var i = 0 , len = binaryArray.length ; i < len ; ){
			if(binaryArray[i] == 0){
				unicode=unicode.concat(this.toDecimal(binaryArray.slice(i,i+8)));
				i += 8;
			}else{
				var sum = 0;
				while(i < len){
					if(binaryArray[i] == 1){
						++sum;
					}else{
						break;
					}
					++i;
				}
				unicodeBinary = unicodeBinary.concat(binaryArray.slice(i+1 , i+8-sum));
				i += 8 - sum;
				while(sum > 1){
					unicodeBinary = unicodeBinary.concat(binaryArray.slice(i+2 , i+8));
					i += 8;
					--sum;
				}
				unicode = unicode.concat(_toDecimal(unicodeBinary));
				unicodeBinary = [];
			}
		}
		return unicode;
	}
};
var UTF8 = {
    encode: function($input) {
        $input = $input.replace(/\r\n/g,"\n");
        var $output = "";
        for (var $n = 0; $n < $input.length; $n++) {
            var $c = $input.charCodeAt($n);
            if ($c < 128) {
                $output += String.fromCharCode($c);
            } else if (($c > 127) && ($c < 2048)) {
                $output += String.fromCharCode(($c >> 6) | 192);
                $output += String.fromCharCode(($c & 63) | 128);
            } else {
                $output += String.fromCharCode(($c >> 12) | 224);
                $output += String.fromCharCode((($c >> 6) & 63) | 128);
                $output += String.fromCharCode(($c & 63) | 128);
            }
        }
        return $output;
    },
    decode: function($input) {
        var $output = "";
        var $i = 0;
        var $c = $c1 = $c2 = 0;
        while ( $i < $input.length ) {
            $c = $input.charCodeAt($i);
            if ($c < 128) {
                $output += String.fromCharCode($c);
                $i++;
            } else if(($c > 191) && ($c < 224)) {
                $c2 = $input.charCodeAt($i+1);
                $output += String.fromCharCode((($c & 31) << 6) | ($c2 & 63));
                $i += 2;
            } else {
                $c2 = $input.charCodeAt($i+1);
                $c3 = $input.charCodeAt($i+2);
                $output += String.fromCharCode((($c & 15) << 12) | (($c2 & 63) << 6) | ($c3 & 63));
                $i += 3;
            }
        }
        return $output;
    }
};

var Base64 = {
    base64: "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",
    encode: function($input) {
        if (!$input) {
            return false;
        }
        //$input = UTF8.encode($input);
        var $output = "";
        var $chr1, $chr2, $chr3;
        var $enc1, $enc2, $enc3, $enc4;
        var $i = 0;
        do {
            $chr1 = $input.charCodeAt($i++);
            $chr2 = $input.charCodeAt($i++);
            $chr3 = $input.charCodeAt($i++);
            $enc1 = $chr1 >> 2;
            $enc2 = (($chr1 & 3) << 4) | ($chr2 >> 4);
            $enc3 = (($chr2 & 15) << 2) | ($chr3 >> 6);
            $enc4 = $chr3 & 63;
            if (isNaN($chr2)) $enc3 = $enc4 = 64;
            else if (isNaN($chr3)) $enc4 = 64;
            $output += this.base64.charAt($enc1) + this.base64.charAt($enc2) + this.base64.charAt($enc3) + this.base64.charAt($enc4);
        } while ($i < $input.length);
        return $output;
    },
    decode: function($input) {
        if(!$input) return false;
        $input = $input.replace(/[^A-Za-z0-9\+\/\=]/g, "");
        var $output = "";
        var $enc1, $enc2, $enc3, $enc4;
        var $i = 0;
        do {
            $enc1 = this.base64.indexOf($input.charAt($i++));
            $enc2 = this.base64.indexOf($input.charAt($i++));
            $enc3 = this.base64.indexOf($input.charAt($i++));
            $enc4 = this.base64.indexOf($input.charAt($i++));
            $output += String.fromCharCode(($enc1 << 2) | ($enc2 >> 4));
            if ($enc3 != 64) $output += String.fromCharCode((($enc2 & 15) << 4) | ($enc3 >> 2));
            if ($enc4 != 64) $output += String.fromCharCode((($enc3 & 3) << 6) | $enc4);
        } while ($i < $input.length);
        return $output; //UTF8.decode($output);
    }
};

var Hex = {
    hex: "0123456789abcdef",
    encode: function($input) {
        if(!$input) return false;
        var $output = "";
        var $k;
        var $i = 0;
        do {
            $k = $input.charCodeAt($i++);
            $output += this.hex.charAt(($k >> 4) &0xf) + this.hex.charAt($k & 0xf);
        } while ($i < $input.length);
        return $output;
    },
    decode: function($input) {
        if(!$input) return false;
        $input = $input.replace(/[^0-9abcdef]/g, "");
        var $output = "";
        var $i = 0;
        do {
            $output += String.fromCharCode(((this.hex.indexOf($input.charAt($i++)) << 4) & 0xf0) | (this.hex.indexOf($input.charAt($i++)) & 0xf));
        } while ($i < $input.length);
        return $output;
    }
};

var ASN1Data = function($data) {
    this.error = false;
    this.parse = function($data) {
        if (!$data) {
            this.error = true;
            return null;
        }
        var $result = [];
        while($data.length > 0) {
            // get the tag
            var $tag = $data.charCodeAt(0);
            $data = $data.substr(1);
            // get length
            var $length = 0;
            // ignore any null tag
            if (($tag & 31) == 0x5) $data = $data.substr(1);
            else {
                if ($data.charCodeAt(0) & 128) {
                    var $lengthSize = $data.charCodeAt(0) & 127;
                    $data = $data.substr(1);
                    if($lengthSize > 0) $length = $data.charCodeAt(0);
                    if($lengthSize > 1)    $length = (($length << 8) | $data.charCodeAt(1));
                    if($lengthSize > 2) {
                        this.error = true;
                        return null;
                    }
                    $data = $data.substr($lengthSize);
                } else {
                    $length = $data.charCodeAt(0);
                    $data = $data.substr(1);
                }
            }
            // get value
            var $value = "";
            if($length) {
                if ($length > $data.length){
                    this.error = true;
                    return null;
                }
                $value = $data.substr(0, $length);
                $data = $data.substr($length);
            }
            if ($tag & 32)
                $result.push(this.parse($value)); // sequence
            else
                $result.push(this.value(($tag & 128) ? 4 : ($tag & 31), $value));
        }
        return $result;
    };
    this.value = function($tag, $data) {
        if ($tag == 1)
            return $data ? true : false;
        else if ($tag == 2) //integer
            return $data;
        else if ($tag == 3) //bit string
            return this.parse($data.substr(1));
        else if ($tag == 5) //null
            return null;
        else if ($tag == 6){ //ID
            var $res = [];
            var $d0 = $data.charCodeAt(0);
            $res.push(Math.floor($d0 / 40));
            $res.push($d0 - $res[0]*40);
            var $stack = [];
            var $powNum = 0;
            var $i;
            for($i=1;$i<$data.length;$i++){
                var $token = $data.charCodeAt($i);
                $stack.push($token & 127);
                if ( $token & 128 )
                    $powNum++;
                else {
                    var $j;
                    var $sum = 0;
                    for($j=0;$j<$stack.length;$j++)
                        $sum += $stack[$j] * Math.pow(128, $powNum--);
                    $res.push($sum);
                    $powNum = 0;
                    $stack = [];
                }
            }
            return $res.join(".");
        }
        return null;
    }
    this.data = this.parse($data);
};

var RSA = {
	sendData:function($skey,$pass){
    	var pass=$pass.value;
    	if(pass!=null && pass!=""){
	    	$pass.value=this.encrypt(_BASE64.encode(pass), this.getPublicKey($skey));
    	}
	},
    getPublicKey: function($pem) {
    	if($pem.length<1) return false;
        $pem = new ASN1Data(Base64.decode($pem));
        if($pem.error) return false;
        $pem = $pem.data;
        if($pem[0][0][0]=="1.2.840.113549.1.1.1")
            return new RSAPublicKey($pem[0][1][0][0], $pem[0][1][0][1]);
        return false;
    },
    encrypt: function($data, $pubkey) {
        if (!$pubkey) return false;
        var bytes = ($pubkey.modulus.bitLength()+7)>>3;
        $data = this.pkcs1pad2($data,bytes);
        if(!$data) return false;
        $data = $data.modPowInt($pubkey.encryptionExponent, $pubkey.modulus);
        if(!$data) return false;
        $data = $data.toString(16);
        while ($data.length < bytes*2)
            $data = '0' + $data;
        return Base64.encode(Hex.decode($data));
    },
    pkcs1pad2: function($data, $keysize) {
        if($keysize < $data.length + 11)
            return null;
        var $buffer = [];
        var $i = $data.length - 1;
        while($i >= 0 && $keysize > 0)
            $buffer[--$keysize] = $data.charCodeAt($i--);
        $buffer[--$keysize] = 0;
        while($keysize > 2)
            $buffer[--$keysize] = Math.floor(Math.random()*254) + 1;
        $buffer[--$keysize] = 2;
        $buffer[--$keysize] = 0;
        return new BigInteger($buffer);
    }
}
