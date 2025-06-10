package com.equipo.taskmaster;
import java.util.ArrayList;

public class App {
  public static ArrayList<String> tasks = new
ArrayList<>();
  public static void main(String[] args) {
    System.out.println("Bienvenido a TaskMaster!");
    addTask("Estudiar Maven");
    addTask("Leer sobre CI/CD");
    printTasks();
    printEnv();
  }

    public static void addTask(String task) {
    tasks.add(task);
    }
    
    public static void printTasks() {
        System.out.println("Tareas pendientes:");
        for (String t : tasks) {
        System.out.println("- " + t);
       }
   }

    public static void printEnv() {
        System.out.println("Ambiente: " + System.getProperty("env.name"));
   }
}
