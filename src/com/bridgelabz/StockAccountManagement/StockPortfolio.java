package com.bridgelabz.StockAccountManagement;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StockPortfolio {

	public String shareName;
	public int noOfShare;
	public double sharePrice;
	public double totalShareValue;

	private List<Stocks> stock;

	public StockPortfolio() {
		stock = new ArrayList<>();
	}

	public void readFileInput() throws Exception {
		String filePath = "F:\\prasad\\projects\\training\\RPF\\Stock Account Management\\src\\com\\bridgelabz\\StockAccountManagement\\StockInfo";
		List<String> lines = new ArrayList<String>();
		Path path = Paths.get(filePath);
		lines = Files.readAllLines(path);

		System.out.println(lines);
		for (String line : lines) {
			String[] word = line.split(" ");
			shareName = word[0];
			noOfShare = Integer.valueOf(word[1]);
			sharePrice = Double.valueOf(word[2]);
			totalShareValue = Integer.valueOf(word[1]) * Double.valueOf(word[2]);
			Stocks stock = new Stocks(shareName, noOfShare, sharePrice, totalShareValue);
			Stocks.add(Stock);

		}
	}

	public void writeDataIntoFile() throws Exception {
		String filepath = "F:\\\\prasad\\\\projects\\\\training\\\\RPF\\\\Stock Account Management\\\\src\\\\com\\\\bridgelabz\\\\StockAccountManagement\\\\StockSharePrice";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
		for (Stocks s : stock) {
			writer.write(s + System.lineSeparator());
		}

		writer.close();

	}

}
