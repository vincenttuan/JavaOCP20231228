package day02;

/*
 視窗版 BMI 計算機
 
 +-----------------+
 |  BMI Calculator |
 +-----------------+
 |  H(cm): ______  |
 |  W(kg): ______  |
 |                 |
 |  [bmi button]   |
 |                 |
 |  [value&result] |
 +-----------------+
 * */

import javax.swing.*; // 引入 Swing 用於 GUI 介面創建
import java.awt.event.ActionListener; // 引入事件監聽(監聽是否有按一下)
import static util.BMIUtil.calcBmi;
import static util.BMIUtil.getResult;

public class BMIJFrame {
	public static void main(String[] args) {
		// 建立 JFrame 並設定 title
		JFrame frame = new JFrame("BMI 計算器");
		frame.setSize(300, 200); // 視窗大小
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 按下關閉[X]可以離開程式
		
		// 創建一的面板用於放置UI組件
		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel); // 放置 UI 組件的方法
		
		
		// 呈現視窗
		frame.setVisible(true);
	}
	
	private static void placeComponents(JPanel panel) {
		// 使用座標來進行絕對位置布局
		panel.setLayout(null);
		// 建立[身高(cm)]標籤
		JLabel heightLabel = new JLabel("身高(cm):");
		heightLabel.setBounds(10, 20, 80, 25); // 設定位置與大小
		panel.add(heightLabel); // 將標籤配置到面板
		
		// 建立身高輸入框
		JTextField heightInput = new JTextField(20); // 20 表示欄位輸入的寬度
		heightInput.setBounds(100, 20, 165, 25);
		panel.add(heightInput);
		
		// 建立[身高(cm)]標籤
		JLabel weightLabel = new JLabel("體重(kg):");
		weightLabel.setBounds(10, 50, 80, 25); // 設定位置與大小
		panel.add(weightLabel); // 將標籤配置到面板
		
		// 建立體重輸入框
		JTextField weightInput = new JTextField(20); // 20 表示欄位輸入的寬度
		weightInput.setBounds(100, 50, 165, 25);
		panel.add(weightInput);
		
		// 建立按鈕
		JButton calculateButton = new JButton("計算 BMI");
		calculateButton.setBounds(10, 80, 120, 25);
		panel.add(calculateButton);
		
		// 建立顯示計算結果的標籤
		JLabel resultLabel = new JLabel("...");
		resultLabel.setBounds(10, 110, 200, 25);
		panel.add(resultLabel);
		
		// 按下 button 後要做的事
		ActionListener actionListener = (e) -> {
			// heightInput.getText() 會得到字串內容
			// Double.parseDouble() 可以將字串轉 double
			double h = Double.parseDouble(heightInput.getText());
			double w = Double.parseDouble(weightInput.getText());
			double bmi = calcBmi(h, w);
			String result = getResult(bmi);
			String resultMessage = String.format("%.1f %s", bmi, result);
			resultLabel.setText(resultMessage); // 將結果放到 resultLabel UI 上呈現
		};
				
	}
}
























