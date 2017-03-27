package learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Random;

/**
 * Created by slyuan on 16-10-13.
 */

public class Logistic {



    private double learningRate;
    private int Iterations;
    private double[] weight;


    public Logistic(double[] weight, int Iteration, double learningRate) {

        this.weight = weight;
        this.Iterations = Iteration;
        this.learningRate = learningRate;
    }


    public static double sigmod(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }



    public double classify(double[] x) {

        double y = 0.0;
        for (int i = 0; i < weight.length; i++) {
            y += weight[i] * x[i];
        }
        return sigmod(y);
    }

    public void training(List<Instance> datasets) {
        int count = 1;
        while (count < Iterations) {
            double likelood = 0.0;
            for (int i = 0; i < datasets.size(); i++) {
                Instance instance = datasets.get(i);
                int label = instance.label;
                double[] x = instance.x;
                double predict = classify(x);
                for (int j = 0; j < x.length; j++) {
                    weight[j] = weight[j] + learningRate * (label - predict) * x[j];
                }

                likelood += label * Math.log(classify(x)) + (1 - label) * Math.log(1 - classify(x));
            }
            System.out.println("count: " + count + " likelood: " + likelood + " weight: " + Arrays.toString(weight));
            count++;
        }

    }


    public static List<Instance> importDataSets(String url) throws IOException {
        List<Instance> dataSets = new ArrayList<Instance>();

        BufferedReader br = new BufferedReader(new FileReader(url));
        String line = br.readLine();

        while (line != null) {
            if (line.startsWith("#")) {
                line = br.readLine();
            }
            String[] columns = line.split("\\s+");

            // skip first column and last column is the label
            int i = 1;
            double[] data = new double[columns.length - 1];
            data[0] = 1;
            for (i = 1; i < columns.length - 1; i++) {
                data[i] = Double.parseDouble(columns[i]);
            }
            int label = Integer.parseInt(columns[i]);
            Instance instance = new Instance(label, data);
            dataSets.add(instance);

            line = br.readLine();
        }

        return dataSets;
    }


    public static void main(String[] args) throws IOException {

        List<Instance> instances = importDataSets("/home/slyuan/Downloads/dataset.txt");
        Random r = new Random();
        double[] weight = new double[6];
        for(int i = 0; i < 6; i++) {
            weight[i] = r.nextDouble();
        }
        Logistic lr = new Logistic(weight,3000,0.0001);
        lr.training(instances);
        double[] x = {1, 2, 1, 1, 0, 1};
        System.out.println("prob(1|x) = " + lr.classify(x));

        double[] x2 = {1, 3, 3, 10, 0, 0};
        System.out.println("prob(1|x2) = " + lr.classify(x2));
    }


    public static class Instance {
        int label;
        double[] x;

        public Instance(int label, double[] x) {
            this.label = label;
            this.x = x;
        }
    }
}
