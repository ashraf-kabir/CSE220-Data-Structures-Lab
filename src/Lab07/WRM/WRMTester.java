//package Lab07.WRM;
//
//import java.util.Scanner;
//
//public class WRMTester {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter 1 or 2 (1 for Array & 2 for Linked List): ");
//        int k = sc.nextInt();
//
//        if (k == 1 || k == 2) {
//            WaitingRoomManagement p = new WaitingRoomManagement(k);
//            int selection = 0;
//            // 111
//            while (true) {
//                try {
//                    System.out.println("Please enter 1 to 5");
//                    selection = sc.nextInt();
//                    if (selection < 1 || selection > 6) {
//                        System.err.println("Wrong Selection! Please, try Again.");
//                        break;
//                    }
//
//                    // else break;
//                    // }
//                    else {
//                        int id = 0;
//                        if (selection == 1) {
//                            id = id + 1;
//                            p.registerPatient(id);
//                        } else if (selection == 2) {
//                            p.ServePatient();
//                        } else if (selection == 3) {
//                            p.CancelAll();
//                        } else if (selection == 4) {
//                            p.CanDoctorGoHome();
//
//                        } else if (selection == 5) {
//                            p.ShowAllPatient();
//                        } else if (selection == 6) {
//                            p.print();
//                        }
//                    }
//                }
//
//                catch (Exception e) {
//                    System.err.println("Input Format Mismatch! Please, try Again.");
//                    System.err.println(e);
//                    sc.next();
//                }
//
//            }
//        }
//        System.out.println(k);
//        if (k != 1 && k != 2) {
//            System.err.println("Sorry,cannot take anything else rather than 1 or 2!!!");
//        }
//
//        System.err.println("==THE END==");
//
//    }
//}
