package Java;

import java.util.Scanner;
import java.util.Collections;

public class carregdriver {
    public static void main(String[] args) {
        carreg c = new carreg();
        Scanner sc = new Scanner(System.in);
        int test = 1;
        // While loop to get to main menu once complete a case statement
        while (test <= 10) {
            System.out.println("Type number 1 for add vehicles");
            System.out.println("Type number 2 to view added vehicles");
            System.out.println("Type number 3 to remove an added vehicle");
            System.out.println("Type number 4 to add the placements from the three rounds");
            System.out.println("Type number 5 to display the placements");
            System.out.println("Type number 6 to search for a vehicle");
            System.out.println("Type number 7 to sort the participants in reverse order");

            switch (sc.nextInt()) {
                case 1:
                    while (c.participant1.size() < 4) {
                        System.out.println("Enter the vehicle number of participant 1: ");
                        String name = sc.next();
                        c.participant1.add(name);
                        System.out.print("Enter the vehicle brand of participant 1: ");
                        String brand = sc.next();
                        c.participant1.add(brand);
                        System.out.print("Enter the Sponsor of participant 1: ");
                        String sponsor = sc.next();
                        c.participant1.add(sponsor);
                        System.out.print("Enter the Driver Name of participant 1: ");
                        String driver = sc.next();
                        c.participant1.add(driver);
                    }

                    while (c.participant2.size() < 4) {
                        System.out.print("Enter the vehicle number of participant 2: ");
                        String name = sc.next();
                        c.participant2.add(name);
                        System.out.print("Enter the vehicle brand of participant 2: ");
                        String brand = sc.next();
                        c.participant2.add(brand);
                        System.out.print("Enter the Sponsor of participant 2: ");
                        String sponsor = sc.next();
                        c.participant2.add(sponsor);
                        System.out.print("Enter the Driver Name of participant 2: ");
                        String driver = sc.next();
                        c.participant2.add(driver);
                    }

                    while (c.participant3.size() < 4) {
                        System.out.print("Enter the vehicle number of participant 3: ");
                        String name = sc.next();
                        c.participant3.add(name);
                        System.out.print("Enter the vehicle brand of participant 3: ");
                        String brand = sc.next();
                        c.participant3.add(brand);
                        System.out.print("Enter the Sponsor of participant 3: ");
                        String sponsor = sc.next();
                        c.participant3.add(sponsor);
                        System.out.print("Enter the Driver Name of participant 3: ");
                        String driver = sc.next();
                        c.participant3.add(driver);
                    }

                    while (c.participant4.size() < 4) {
                        System.out.print("Enter the vehicle number of participant 4: ");
                        String name = sc.next();
                        c.participant4.add(name);
                        System.out.print("Enter the vehicle brand of participant 4: ");
                        String brand = sc.next();
                        c.participant4.add(brand);
                        System.out.print("Enter the Sponsor of participant 4: ");
                        String sponsor = sc.next();
                        c.participant4.add(sponsor);
                        System.out.print("Enter the Driver Name of participant 4: ");
                        String driver = sc.next();
                        c.participant4.add(driver);
                    }

                    while (c.participant5.size() < 4) {
                        System.out.print("Enter the vehicle number of participant 5: ");
                        String name = sc.next();
                        c.participant5.add(name);
                        System.out.print("Enter the vehicle brand of participant 5: ");
                        String brand = sc.next();
                        c.participant5.add(brand);
                        System.out.print("Enter the Sponsor of participant 5: ");
                        String sponsor = sc.next();
                        c.participant5.add(sponsor);
                        System.out.print("Enter the Driver Name of participant 5: ");
                        String driver = sc.next();
                        c.participant5.add(driver);
                    }

                    while (c.participant6.size() < 4) {
                        System.out.print("Enter the vehicle number of participant 6: ");
                        String name = sc.next();
                        c.participant6.add(name);
                        System.out.print("Enter the vehicle brand of participant 6: ");
                        String brand = sc.next();
                        c.participant6.add(brand);
                        System.out.print("Enter the Sponsor of participant 6: ");
                        String sponsor = sc.next();
                        c.participant6.add(sponsor);
                        System.out.print("Enter the Driver Name of participant 6: ");
                        String driver = sc.next();
                        c.participant6.add(driver);
                    }
                    //Clears the participants if needed to be re-added once removed
                    c.participantsList.clear();
                    c.ParticipantQueue.clear();
                    // Adding the participants into the 2D arraylist
                    c.participantsList.add(c.participant1);
                    c.participantsList.add(c.participant2);
                    c.participantsList.add(c.participant3);
                    c.participantsList.add(c.participant4);
                    c.participantsList.add(c.participant5);
                    c.participantsList.add(c.participant6);

                    for (int i = 0; i < c.participantsList.size(); i++) {
                        c.vehicleNumber.add(c.participantsList.get(i).get(0));
                    }
                    // add the vehicle numbers of the participants to the Queue
                    for (int i = 0; i < c.participantsList.size(); i++) {
                        // for(int j=0;j<c.participantsList.get(i).size();j++){
                        c.ParticipantQueue.add(c.participantsList.get(i).get(0));
                    }
                    System.out.println("The first participant's vehicle number is: " + c.ParticipantQueue.peek());
                    System.out.println(+c.ParticipantQueue.size() + " Participants have been added into the queue");

                    break;
                
                case 2:
                // Outputs the participant details
                    for (String element : c.participant1) {
                        System.out.println(element);
                    }
                    System.out.println("----------------------------------");
                    for (String element : c.participant2) {
                        System.out.println(element);
                    }
                    System.out.println("----------------------------------");
                    for (String element : c.participant3) {
                        System.out.println(element);
                    }
                    System.out.println("----------------------------------");
                    for (String element : c.participant4) {
                        System.out.println(element);
                    }
                    System.out.println("----------------------------------");
                    for (String element : c.participant5) {

                        System.out.println(element);
                    }
                    System.out.println("----------------------------------");
                    for (String element : c.participant6) {
                        System.out.println(element);
                    }
                    break;

                case 3:
                // Removes the provided participant details from the array
                    System.out.println("Enter the vehicle number to remove: ");
                    String remove = sc.next();
                    if (c.participant1.contains(remove)) {
                        c.participant1.removeAll(c.participant1);
                        System.out.println("First Participant Removed successfully");
                    } else if (c.participant2.contains(remove)) {
                        c.participant2.removeAll(c.participant2);
                        System.out.println("Second Participant Removed successfully");
                    } else if (c.participant3.contains(remove)) {
                        c.participant3.removeAll(c.participant3);
                        System.out.println("Third Participant Removed successfully");
                    } else if (c.participant4.contains(remove)) {
                        c.participant4.removeAll(c.participant4);
                        System.out.println("Forth Participant Removed successfully");
                    } else if (c.participant5.contains(remove)) {
                        c.participant5.removeAll(c.participant5);
                        System.out.println("Fifth Participant Removed successfully");
                    } else if (c.participant6.contains(remove)) {
                        c.participant6.removeAll(c.participant6);
                        System.out.println("Sixth Participant Removed successfully");
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 4:
                    // stack implementation to add the participants into the stack
                    System.out.println("Enter the vehicle number of the first round winners");
                    for (int i = 0; i < 6; i++) {
                        System.out.println("Enter winner " + (i + 1) + " vehicle number:");
                        String FirstRound = sc.next();
                        // If statement to check if the vehicle number is already in the array and not
                        if (c.ParticipantQueue.contains(FirstRound) && !c.firstround.contains(FirstRound)) {
                            c.firstround.push(FirstRound);
                        } else {
                            System.out.println("Invalid input");
                            i--;
                        }
                    }
                    //Eliminates the last participant from the race
                    c.firstround.pop();

                    System.out.println("----------------------------------");
                    System.out.println("Enter the vehicle number of the second round winners");
                    // print second round stack
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Enter winner " + (i + 1) + " vehicle number:");
                        String SecondRound = sc.next();
                        // If statement to check if the vehicle number is already in the array and not
                        if (c.firstround.contains(SecondRound) && !c.secondround.contains(SecondRound)) {
                            c.secondround.push(SecondRound);
                        } else {
                            System.out.println("Invalid input");
                            i--;
                        }
                    }
                    //Eliminates the last participant from the race
                    c.secondround.pop();

                    System.out.println("----------------------------------");
                    System.out.println("Enter the vehicle number of the third round winners");
                    // print third round stack
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Enter winner " + (i + 1) + " vehicle number:");
                        String ThirdRound = sc.next();
                        // If statement to check if the vehicle number is already in the array and not
                        if (c.secondround.contains(ThirdRound) && !c.thirdround.contains(ThirdRound)) {
                            c.thirdround.push(ThirdRound);
                        } else {
                            System.out.println("Invalid input");
                            i--;
                        }
                    }
                    //Eliminates the last participant from the race
                    c.thirdround.pop();

                case 5:
                //Outputs the placement from the 3 races
                    System.out.println("First round placements are:" + c.firstround);
                    System.out.println("Second round placements are:" + c.secondround);
                    System.out.println("Third round placements are:" + c.thirdround);
                    break;

                case 6:

                    // linear search to find participant details
                    System.out.println("Enter the vehicle number of the participant");
                    String vehicle = sc.next();
                    int pos = 0;
                    boolean found = false;
                    while (pos < c.vehicleNumber.size() && !found) {
                        if (c.vehicleNumber.get(pos).equals(vehicle)) {
                            found = true;
                        } else {
                            pos++;
                        }
                    }
                    if (found) {
                        System.out.println("Found at position " + pos);
                        System.out.println("Participant Details: " + c.participantsList.get(pos));

                    }
                    else {
                    System.out.println("Not found");
                }
                    break;

                case 7:
                for(int i = 0; i< c.participantsList.size(); i++) {
                    for (int j = 0; j < c.participantsList.size(); j++)
                        System.out.print(c.participantsList.get(i).get(j) + " ");
                }
                    // Sort the participants list in newest to the oldest order
                    Collections.sort(c.vehicleNumber, Collections.reverseOrder());
                    System.out.println("The list of participants in reverse order are:" + c.vehicleNumber);
                       
                    break;

                case 8:
                //convert vehicle number list to integer and paste into a new array
                int [] vehicleNumber = new int[6];


                }

            }
        }
    }

