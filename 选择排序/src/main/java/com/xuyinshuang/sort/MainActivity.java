package com.xuyinshuang.sort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int []list={3,-5,23,-45,456,-1,36,45,-15,23};
        //控制数组中每一个元素的下标，要比较的那个元素的符号
        for (int i=0;i<list.length-1;i++){
            //操作与i元素比较的所有元素下标
            for (int j=i+1;j<list.length;j++){
                //如果list[i]>list[j]
                if (list[i]>list[j]){
                    //定义临时变量存储list[j]和list[i]中的最大值
                    int tem=list[j];
                    //把相互比较的两个数交换位置
                    list[j]=list[i];
                    list[i]=tem;
                }
            }
        }
        for (int i=0;i<list.length;i++){
            //按排序后从小到大排序
            System.out.println("  选择  "+list[i]+"  排序");
        }
    }
}
