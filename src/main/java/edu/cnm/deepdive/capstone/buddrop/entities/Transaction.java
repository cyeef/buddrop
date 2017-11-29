package edu.cnm.deepdive.capstone.buddrop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Delivery_Transaction")
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String cardId;
  private String firstName;
  private String lastName;
  private String phoneNumber;

  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
    
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;

  }

  public void setPhoneNumber(String telphone) {
    this.phoneNumber = telphone;
  }
}
