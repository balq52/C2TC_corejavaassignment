package com.sreeja.assignment6.item;

import java.util.Scanner;
import com.sreeja.assignment6.item.TicketBooking;
import com.sreeja.assignment6.library.PaymentProcessor;

public class Main {   // <-- make it public
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Ticket Booking input
        String bookingInput = sc.nextLine();
        String[] parts = bookingInput.split(",");
        TicketBooking booking = new TicketBooking(parts[0], parts[1], Integer.parseInt(parts[2]));

        // Read payment mode
        int choice = Integer.parseInt(sc.nextLine());

        // Payment processor object
        PaymentProcessor processor = new PaymentProcessor();

        // Print booking details
        booking.displayDetails();

        switch (choice) {
            case 1:
                double cashAmount = Double.parseDouble(sc.nextLine());
                processor.makePayment(cashAmount);
                break;

            case 2:
                double walletAmount = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                processor.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double cardAmount = Double.parseDouble(sc.nextLine());
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                processor.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
