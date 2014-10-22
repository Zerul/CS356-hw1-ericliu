/*
 * Eric Liu
 * Professor Yu Sun
 * CS 356
 * Homework 1: iClicker
 */
import java.util.Random;

public class SimulationDriver {

    public static void main(String[] args) throws Exception {
        SampleMultipleChoiceQuestion mc = new SampleMultipleChoiceQuestion("Simulating a Multiple Choice Question.");
        TrueFalseQuestion tf = new TrueFalseQuestion("Simulating a True/False Question.");
        Random gen = new Random(System.currentTimeMillis());
        ClickerService simulator = new ClickerService();
        Student[] studentArray = new Student[200];
        simulator.formatQuestion(mc);
        System.out.println("Collecting Answers..");
        
        for(int x = 0; x < 200; x++) {
        	studentArray[x] = new Student();
        	studentArray[x].setResponse(gen.nextInt(mc.getAnswerScheme().length));
        	simulator.addAnswer(studentArray[x]);
        }
        System.out.println("\nResults: ");
        simulator.getAnswerCount(mc);
        simulator.reset();
        System.out.println();
        simulator.formatQuestion(tf);
        System.out.println("Collecting Answers..");
        
        for(int x = 0; x < 200; x++) {
        	studentArray[x].setResponse(gen.nextInt(tf.getAnswerScheme().length));
        	simulator.addAnswer(studentArray[x]);
        }
        System.out.println("\nResults: ");
        simulator.getAnswerCount(tf);
    }
}
