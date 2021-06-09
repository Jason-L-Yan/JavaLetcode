package com.bjpowernode.module.charts;

import com.bjpowernode.service.CharService;
import com.bjpowernode.service.impl.CharServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;

import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @author admin
 */
public class PieChart implements Initializable {

    @FXML
    private javafx.scene.chart.PieChart pieChart;
    private CharService charService = new CharServiceImpl();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // 通过service获取数据
        Map<String, Integer> map = charService.bookTypeCount();
        Data[] dataArray = new Data[map.size()];
        // 定义数据下标
        int i = 0;
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            dataArray[i++] = new Data(next.getKey(),next.getValue());
        }
//        for (int j = 0; j < dataArray.length; j++) {
//            System.out.println("哈哈" + dataArray[j]);
//        }
        // 将数组转成ObservableList
        ObservableList<Data> pieChartData = FXCollections.observableArrayList(
                dataArray
//                new Data("文学", 12),
//                new Data("经济", 25),
//                new Data("管理", 22)
        );
        pieChart.setData(pieChartData);
        pieChart.setClockwise(false);
    }
}
