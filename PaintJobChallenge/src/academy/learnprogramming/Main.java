package academy.learnprogramming;

import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4,2.1,1.5,0));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets <0) return  -1;

        double areaOfWall = width * height;
        double availablePaint = extraBuckets * areaPerBucket;
        double areaToCover = areaOfWall - availablePaint;
        int requiredBuckets = (int) Math.ceil(areaToCover/areaPerBucket);
        return requiredBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <=0 || areaPerBucket <= 0) return  -1;

        double areaOfWall = width * height;
        int requiredBuckets = (int) Math.ceil(areaOfWall/areaPerBucket);
        return requiredBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <=0 || areaPerBucket <= 0) return  -1;

        int requiredBuckets = (int) Math.ceil(area/areaPerBucket);
        return requiredBuckets;
    }
}
