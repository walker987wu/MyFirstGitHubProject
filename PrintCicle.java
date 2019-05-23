package com.wlh;

public class PrintCicle {
	public static void main(String[] args) {
		
		int[][] a = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		int rows = a.length;
		int cols = a[0].length;
		String s = "";
		
		if(a == null || cols <= 0 || rows <= 0){
			System.out.print("错误");
		}else {
			int start = 0;
			while(cols > start*2 && rows > start*2){
				int endX = cols - 1 - start;
				int endY = rows - 1 - start;
					
				//从左到右打印一行
				for (int i = start; i <= endX; ++i) {
					int number = a[start][i];
					s+=number+"";
				}
				//从上到下打印一列
				if(start < endY){
					for (int i = start + 1; i <= endY; ++i) {
						int number = a[i][endX];
						s+=number+"";
					}
				}
				//从右向左打印一行
				if(start < endX && start < endY){
					for (int i = endX-1; i >= start; --i) {
						int number = a[endY][i];
						s+=number+"";
					}
				}
				//从下向上打印一列
				if(start < endX && start < endY - 1){
					for (int i = endY-1; i >= start + 1; --i) {
						int number = a[i][start];
						s+=number+"";
					}
				}
				++start;
			}
			System.out.println(s);
		}
		
	}
}
