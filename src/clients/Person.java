package clients;

import java.util.Locale;

public class Person {

    protected String name;
    protected String surname;
    protected int ticketAmount;

    public Person (String name, String surname, int ticketAmount) {
        this.name = name;
        this.surname = surname;
        this.ticketAmount = ticketAmount;
    }

    public String present() {
        return name + " " + surname;
    }

    public void setName(String name) {
        if(Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            return;
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if(Character.isUpperCase(surname.charAt(0))) {
            this.surname = surname;
        } else {
            return;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setTicketAmount(int amount) {
        if(amount < 0) {
            return;
        } else {
            ticketAmount = amount;
        }
    }

    public int getTicketAmount() {
        return ticketAmount;
    }
}
