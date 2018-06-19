package com.ellisdeclercq.beehive;

public class Worker {




    int capacity; // vanaf nu hebben Workers een capacity
    int load;  // vanaf nu hebben Workers een load --> Als je static niet gebruikt wil dat zeggen dat elke instantie hier gebruik van maakt

 public Worker (int initialCapacity, int initialLoad) {
     System.out.println("Constructor");
     capacity = initialCapacity;
     load = initialLoad;
 }

 Worker maja = new Worker(150, 10); // zo maken we een object (maja) aan in de klasse Worker;
        public static void main(String[] args) {


        // public  void gatherNectar() { // elke bij heeft van de classe Worker heeft een gatherNectar mogelijkheid
            for (int i = 0; i > 10; i++) {
               // System.out.println("Visit next flower" + load + capacity);// visit flower
                // load += 5;
            }

        }
    }

