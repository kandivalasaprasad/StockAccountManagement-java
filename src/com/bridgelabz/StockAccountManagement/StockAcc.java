package com.bridgelabz.StockAccountManagement;

public class StockAcc {


		public static void main(String[] args) throws Exception {
			StockPortfolio portfolio = new StockPortfolio();
			portfolio.readFileInput();
			portfolio.writeDataIntoFile();
		}
	

}
