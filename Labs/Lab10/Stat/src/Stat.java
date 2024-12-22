/*
 * Stat.java
 * Author: DIEGO SANCHEZ-CARAPIA
 * Submission Date:  4/11/2024
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 What the program does is that I am supposed to update the Stat class, so I can
 see how overloading works, and also add a few new methods to it such as variance.
 and then I had to modify a few methods to include when the parameter is null.

 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the
 * School of Computing at the University of Georgia.
 */
public class Stat {
    private double[] data;

    public Stat(){
        this.data = new double[]{};
    }
    public Stat(double[] d){
        double[] ans = new double[d.length];
        for(int i = 0; i < d.length; i ++){
            ans[i] = d[i];
        }
        this.data = ans;
    }
    public Stat(float[] f){
        double[] ans = new double[f.length];
        for(int i = 0; i < f.length; i ++){
            ans[i] = f[i];
        }
        this.data = ans;
    }
    public Stat(int[] i){
        double[] ans = new double[i.length];
        for(int j = 0; j < i.length; j ++){
            ans[j] = i[j];
        }
        this.data = ans;
    }
    public Stat(long[] lo){
        double[] ans = new double[lo.length];
        for(int i = 0; i < lo.length; i++){
            ans[i] = lo[i];
        }
        this.data = ans;
    }



    public static void main(String[] args) {
        double[] data1 = {};
        double[] data2 = { 25 };
        float[] data3 = {};
        float[] data4 = { 25 };
        int[] data5 = {};
        int[] data6 = { 50 };
        long[] data7 = {};
        long[] data8 = { 12 };
        Stat stat1 = new Stat();
        stat1.append(data1);
        stat1.append(data2);
        stat1.append(data3);
        stat1.append(data4);
        stat1.append(data5);
        stat1.append(data6);
        stat1.append(data7);
        stat1.append(data8);
        data1 = null;
        stat1.append(data1);
        System.out.println("stat1 data = " + stat1.toString());
        System.out.println("stat1 min = " + stat1.min());
        System.out.println("stat1 max = " + stat1.max());
        System.out.println("stat1 average = " + stat1.average());
        System.out.println("stat1 mode = " + stat1.mode());
        System.out.println("stat1 variance = " + stat1.variance());
        System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
    }

    public void setData(float[] f){
        if(f == null){
            reset();
        }
        else{
            double[] ans = new double[f.length];
            for(int i = 0; i < f.length; i ++){
                ans[i] = f[i];
            }
            this.data = ans;
        }
    }
    public void setData(double[] d){
        if(d == null){
            reset();
        }
        else{
            double[] ans = new double[d.length];
            for(int i = 0; i < d.length; i ++){
                ans[i] = d[i];
            }
            this.data = ans;
        }


    }
    public void setData(int[] i){
        if(i == null){
            reset();
        }
        else{
            double[] ans = new double[i.length];
            for(int j = 0; j < i.length; j ++){
                ans[j] = i[j];
            }
            this.data = ans;
        }
    }
    public void setData(long[] lo){
        if(lo == null){
            reset();
        }
        else{
            double[] ans = new double[lo.length];
            for(int i = 0; i < lo.length; i ++){
                ans[i] = lo[i];
            }
            this.data = ans;
        }
    }
    public double[] getData(){
        double[] ans = new double[this.data.length];
        for(int i = 0; i < this.data.length; i ++){
            ans[i] = this.data[i];
        }
        return ans;
    }
    public boolean equals (Stat s){
        if(s == null || this.data == null || s.data.length == 0 || this.data.length == 0){
            return false;
        }
        int count = 0;
        for(int i = 0; i < this.data.length; i++){
            if(s.data[i] == this.data[i]){
                count ++;
            }
        }
        return count == this.data.length;
    }

    public void reset(){
        double[] ans = new double[0];
        this.data = ans;
    }
    public void append(int[] i){
        if(i != null){
            double[] ans = new double[i.length + this.data.length];
            int counter = 0;
            for(int k = 0; k < this.data.length; k ++){
                ans[k] = this.data[k];
                counter++;
            }
            for(int k = 0; k < i.length; k ++){
                ans[counter] = i[k];
                counter++;
            }
            this.data = ans;
        }
    }
    public void append(float[] f){
        if(f != null) {
            double[] ans = new double[f.length + this.data.length];
            int counter = 0;
            for (int k = 0; k < this.data.length; k++) {
                ans[k] = this.data[k];
                counter++;
            }
            for (int k = 0; k < f.length; k++) {
                ans[counter] = f[k];
                counter++;
            }
            this.data = ans;
        }
    }
    public void append(long[] lo){
        if(lo != null) {
            double[] ans = new double[lo.length + this.data.length];
            int counter = 0;
            for (int k = 0; k < this.data.length; k++) {
                ans[k] = this.data[k];
                counter++;
            }
            for (int k = 0; k < lo.length; k++) {
                ans[counter] = lo[k];
                counter++;
            }
            this.data = ans;
        }
    }
    public void append(double[] d){
        if(d != null) {
            double[] ans = new double[d.length + this.data.length];
            int counter = 0;
            for (int k = 0; k < this.data.length; k++) {
                ans[k] = this.data[k];
                counter++;
            }
            for (int k = 0; k < d.length; k++) {
                ans[counter] = d[k];
                counter++;
            }
            this.data = ans;
        }
    }
    public boolean isEmpty(){
        return this.data.length == 0;
    }
    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        String ans = "[";
        for(int i = 0; i < this.data.length; i ++){
            ans += this.data[i] + ", ";
        }
        ans = ans.substring(0,ans.length()-2);
        return ans + "]";
    }

    public double min(){
        if(isEmpty()){
            return Double.NaN;
        }
        double ans = this.data[0];
        for(int i = 0; i < this.data.length; i ++){
            if(ans > this.data[i]){
                ans = this.data[i];
            }
        }
        return ans;
    }

    public double max(){
        if(isEmpty()){
            return Double.NaN;
        }
        double ans = this.data[0];
        for(int i = 0; i < this.data.length; i ++){
            if(ans < this.data[i]) {
                ans = this.data[i];
            }
        }
        return ans;
    }
    public double average(){
        double sum = 0;
        for(int i = 0; i < this.data.length; i ++){
            sum+= this.data[i];
        }
        return sum / this.data.length;
    }
    public double mode() {
        if(isEmpty()){
            return Double.NaN;
        }
        int[] posCount = new int[this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data.length; j++) {
                if (this.data[i] == this.data[j]) {//i = number its checking, j == iterating the list
                    posCount[i]++;
                }
            }
        }
        int posOfMax = 0;
        double ans = posCount[0];//get most number of counts;
        for(int i = 0; i < posCount.length; i ++){
            if(ans < posCount[i]) {
                ans = posCount[i];
                posOfMax = i;
            }
        }
        int countNumberofMax = 0;
        for(int i = 0; i < posCount.length; i ++){
            if(ans == posCount[i]){
                countNumberofMax++;
            }
        }
        if(countNumberofMax == ans) {
            return this.data[posOfMax];
        }
        return Double.NaN;
    }
    private int occursNumberOfTimes(double value){
        int count= 0;
        for(int i = 0; i < this.data.length; i++){
            if(this.data[i] == value){
                count ++;
            }
        }
        return count;
    }
    public double variance(){
        if(isEmpty()){
            return Double.NaN;
        }
        double ans = 0;
        for(int i = 0; i < this.data.length; i ++){
            ans += (this.data[i] - average()) * (this.data[i] - average());
        }
        return ans / this.data.length;
    }
    public double standardDeviation(){
        if(isEmpty()){
            return Double.NaN;
        }
        return Math.pow(this.variance(), 0.5);
    }





}