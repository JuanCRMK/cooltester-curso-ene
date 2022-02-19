package com.java;

public class EjercicioPintor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
//		System.out.println(getBucketCount(3.4, 2.1, 1.5,2.0));
//		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

//		System.out.println(getBucketCount(-3.4, 2.1, 1.5));
//		System.out.println(getBucketCount(3.4, 2.1, 1.5));
//		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		
		System.out.println(getBucketCount(3.4, 1.5));
		System.out.println(getBucketCount(6.26, 2.2));
		System.out.println(getBucketCount(3.26, 0.75));
		

	}

	public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
		int x = width >= 0 && height >= 0 && areaPerBucket >= 0 || extraBuckets > 0 ? 1 : -1;
		double y;

		if (x == 1) {
			y = (width * height) / areaPerBucket - extraBuckets;
			x = (int) Math.ceil(y);
			return x;
		}
		return x;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		int x = width >= 0 && height >= 0 && areaPerBucket >= 0 ? 1 : -1;
		double y;

		if (x == 1) {
			y = (width * height) / areaPerBucket;
			x = (int) Math.ceil(y);
			return x;
		}
		return x;

	}

	public static int getBucketCount(double area, double areaPerBucket) {
		int x = area >= 0 && areaPerBucket >= 0 ? 1 : -1;
		double y;
		
		if (x == 1) {
			y = area / areaPerBucket;
			x = (int) Math.ceil(y);
			return x;
		}
		return x;

	}

}
