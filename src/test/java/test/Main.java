package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static final int N=3;
    public static void main(String[] args) {
        String[] datas= {
                "d1 = I like to watch the sun sun set with my friend.",
                "d2 = The Best Places To Watch  the The Sunset.",
                "d3 = My friend watches the sun come up.",
        };
        HashMap<String,List<String>> processdatas=ProcessData(datas);
        Scanner scanner=new Scanner(System.in);
        List<String> kewords=new ArrayList();
        Map<String, Double> scores = new HashMap<String, Double>();//文档排序结果 文档ID --score
        while(scanner.hasNext()) {
            String keyword=scanner.nextLine();
            if(!keyword.equals("#")) {
                kewords.add(keyword);
            }
            else {
                List<String> docs=solution(processdatas,kewords);
                System.out.println(docs);
                //结果排序
                scores=solution2(docs,kewords,datas);
                for (String doc_id:scores.keySet()){
                    System.out.println(doc_id+"==="+scores.get(doc_id));
                }
                kewords.clear();
            }
        }
    }

    //产生Score
    private static Map<String, Double> solution2(List<String> docs, List<String> kewords, String[] datas) {
        Map<String, Double> res = new HashMap<String, Double>();
        if(docs!=null) {
            for (String doc_id : docs
            ) {
                double score = 0.0;
                for (String term : kewords) {
                    score += Math.log10(1 + tf(term, doc_id, datas)) * Math.log10(N / idf(term, datas) + 1);
                }
                res.put(doc_id, score);
            }
        }
        return res;
    }

    private static int idf(String term, String[] datas) {//包含该term的文档总数
        int count=0;
        for (String unit_doc:datas
             ) {
            String[] wrods = unit_doc.substring(5, unit_doc.length() - 1).split(" ");
            for (String word: wrods
                 ) {
                if(term.equalsIgnoreCase(word)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private static double tf(String term, String doc_id, String[] datas) {
        int frequency=0;
        if(doc_id.equals("d1")){
            String[] words=datas[0].substring(5,datas[0].length()-1).split(" ");
            for (String item:words
                 ) {
                if(term.equalsIgnoreCase(item)){
                    frequency++;
                }
            }
        }
        if(doc_id.equals("d2")){
            String[] words=datas[1].substring(5,datas[1].length()-1).split(" ");
            for (String item:words
            ) {
                if(term.equalsIgnoreCase(item)){
                    frequency++;
                }
            }
        }
        if(doc_id.equals("d3")){
            String[] words=datas[2].substring(5,datas[2].length()-1).split(" ");
            for (String item:words
            ) {
                if(term.equalsIgnoreCase(item)){
                    frequency++;
                }
            }
        }
        return frequency;
    }

    private static List<String> solution(HashMap<String, List<String>> processdatas, List<String> kewords) {
        List<List<String>> argus=new ArrayList<List<String>>();
        for(String keyword:kewords) {
            keyword=keyword.toLowerCase();
            if(!processdatas.containsKey(keyword)) {
                return null;
            }
            else {
                argus.add(processdatas.get(keyword));
            }
        }
        System.out.println(argus);
        return caculateMergeList(argus);
    }
    private static List<String> caculateMergeList(List<List<String>> argus) {
        // TODO Auto-generated method stub

        return intersection(argus);
    }
    /**
     * 处理数据 以出现的单词为key 以所在文档id list为value
     * @param datas
     * @return
     */
    public static HashMap<String, List<String>> ProcessData(String[] datas) {
        // TODO Auto-generated method stub
        HashMap<String,List<String>> finalDatas=new HashMap<String,List<String>>();
        for(String data:datas) {
            String data_id=data.substring(0,2);
            String[] words=data.substring(5,data.length()-1).split(" ");
            for(String word:words) {
                word=word.toLowerCase();//一律转化为小写
                if(!finalDatas.containsKey(word)) {
                    ArrayList<String> list=new ArrayList();
                    list.add(data_id);
                    finalDatas.put(word,list);
                }
                else {
                    if(!finalDatas.get(word).contains(data_id)) {
                        finalDatas.get(word).add(data_id);
                    }
                }
            }

        }
        for(String key:finalDatas.keySet()) {
            Collections.sort(finalDatas.get(key));
        }
        for(String key:finalDatas.keySet()) {
            System.out.println("--"+key+"---"+finalDatas.get(key));
        }
        return finalDatas;
    }

    /**
     * 求多个list的交集
     * @param lists
     * @return
     */
    public static List<String> intersection(List<List<String>> lists) {
        if(lists == null || lists.size() == 0){
            return null;
        }
        ArrayList<List<String>> arrayList = new ArrayList<List<String>>(lists);
        if(arrayList.size() == 0){
            return null;
        }
        List<String> intersection = arrayList.get(0) ;
        // 就只有一个非空集合，结果就是他
        if(arrayList.size() == 1){
            return intersection;
        }
        int i,j=0;
        int index1=0;//共同下标
        int index2=0;//共同下标
        List<String> answers=new ArrayList();
        List<String> list1=lists.get(0);
        List<String> list2=lists.get(1);
        while(index1<list1.size()&&index2<list2.size()) {
            if(list1.get(index1).compareTo(list2.get(index2))==0) {
                answers.add(list1.get(index1));
                index1++;
                index2++;
            }
            else if(list1.get(index1).compareTo(list2.get(index2))<0) {
                index1++;
            }
            else
                index2++;
        }
        // 有多个非空集合，直接挨个交集
//        int i=1;
//        while(arrayList.get(i)!=null) {
//        	for(String string:arrayList.get(i)) {
//        	if(intersection.contains(string)) {
//
//        	}
//        	}
//        }
//        for (int i = 1; i <=arrayList.size()-1; i++) {
//        	intersection.retainAll(arrayList.get(i));
//        }
        return answers;
    }
}
