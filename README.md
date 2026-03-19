#  25K3108-OOP-LAB-8-TASKS
(each task in its own package inside src folder)

## 1. Payment System

An e-commerce platform allows customers to pay using different methods such as **Credit Card**, **PayPal**, and **Bank Transfer**. Although the internal payment process differs, every payment method must provide functionality to **process the payment**.

**Task:**

* Create an interface named `Payment`

  * Method: `processPayment()`
* Create three classes:

  * `CreditCard`
  * `PayPal`
  * `BankTransfer`
* Each class should implement the interface and print a message indicating the payment method used.

---

## 2. Smart Home Automation

A smart home system controls multiple devices such as **Smart Lights** and **Smart Fans**. Every smart device must be able to **turn on** and **turn off** when commanded by the system.

**Task:**

* Create an interface named `SmartDevice`

  * Methods:

    * `turnOn()`
    * `turnOff()`
* Create two classes:

  * `SmartLight`
  * `SmartFan`
* Implement the interface methods in both classes.

---

## 3. Graphics Application

A graphics application calculates the area of different shapes such as **Circle** and **Rectangle**. Each shape has its own formula for calculating area.

---

## 4. Online Learning System

An online learning system has different types of users such as **Student** and **Instructor**.

* All users must be able to **login**.
* Instructors also have the ability to **upload courses**.

---

## 5. Smart Home Appliances

A smart home system manages appliances such as **SmartWashingMachine** and **SmartRefrigerator**.

* Every appliance must be able to **start working**.
* Some appliances also support **remote control** through mobile apps.

**Task:**

* Create an **abstract class** `Appliance`

  * Method: `start()`
* Create an **interface** `RemoteControl`

  * Method: `controlRemotely()`
* Implement both in `SmartWashingMachine`.

