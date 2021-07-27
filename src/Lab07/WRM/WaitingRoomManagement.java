//package Lab07.WRM;
//
//import java.util.*;
//import java.util.Queue;
//
//public class WaitingRoomManagement {
//    Queue aq;
//    Scanner sc = new Scanner(System.in);
//    // ArrayQueue aq=new ArrayQueue();
//    // public static int id=0;*
//    int size;
//
//    public WaitingRoomManagement(int selection) {
//        if (selection == 1) {
//            System.out.println("Making ArrayQueue");
//            aq = (Queue) new ArrayQueue();
//        } else if (selection == 2) {
//            System.out.println("Making Linked list");
//            aq = (Queue) new ListQueue();
//        }
//    }
//    // }
//
//    public void registerPatient(int id) {
//        // id++;*
//        // size++;
//        System.out.println("Write your name");
//        String name = sc.next();
//        System.out.println();
//        System.out.println("Input your age");
//        int age = sc.nextInt();
//        Patient A = new Patient(name, age, id);
//        try {
//            aq.enqueue(A);
//        } catch (Exception e) {
//            System.out.println("Queue Full");
//            System.out.println(e);
//        }
//    }
//
//    public void CanDoctorGoHome() {
//        boolean flag = aq.isEmpty();
//        if (flag == true) {
//            System.out.println("Doctor can go home");
//        } else {
//            System.out.println("No,Doctor cannot go home :( ");
//        }
//
//    }
//
//    public void ServePatient() {
//        try {
//            aq.dequeue();
//        } catch (Exception e) {
//            System.out.println("Queue Empty");
//            System.out.println(e);
//        }
//    }
//
//    public void CancelAll() {
//        boolean flag = aq.isEmpty();
//        while (flag == false) {
//            try {
//                aq.dequeue();
//            } catch (Exception e) {
//                System.out.println("Queue Empty");
//                System.out.println(e);
//                break;
//            }
//        }
//    }
//
//    public void ShowAllPatient() {
//        if (aq.size() != 0) {
//            Object[] a = aq.toArray();
//            Object temp = 0;
//            for (int i = 0; i < a.length - 1; i++) {
//                for (int j = i + 1; j < a.length; j++) {
//                    Patient o = (Patient) a[i];
//                    String n = o.name;
//                    Patient p = (Patient) a[j];
//                    String w = p.name;
//                    int k = n.compareTo(w);
//                    // if((n.compareTo(w))==0){
//                    if (k > 0) {
//                        temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//                    }
//                }
//            }
//            for (int z = 0; z < a.length; z++) {
//                Patient o = (Patient) a[z];
//                if (z == a.length - 1) {
//                    System.out.print(o.name + ".");
//                } else {
//                    System.out.print(o.name + ",");
//                }
//            }
//            System.out.println();
//        } else {
//            System.out.println("Empty queue");
//        }
//
//    }
//
//    public void print() {
//        if (aq.size() != 0) {
//            Object[] a = aq.toArray();
//            for (int z = 0; z < a.length; z++) {
//                Patient o = (Patient) a[z];
//                if (z == a.length - 1) {
//                    System.out.print(o.name + ".");
//                } else {
//                    System.out.print(o.name + ",");
//                }
//
//            }
//            System.out.println();
//
//        } else {
//            System.out.println("Empty queue");
//        }
//    }
//}
