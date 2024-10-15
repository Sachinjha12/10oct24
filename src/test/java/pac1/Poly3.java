package pac1;

//Parent Account Class
class Account {
 private long accNum;
 private double balance;
 private Person accHolder;
 private static long accCounter = 1000;

 public Account(Person accHolder, double initialBalance) {
     this.accHolder = accHolder;
     this.balance = initialBalance;
     this.accNum = accCounter++; // Auto-generate accNum
 }

 public long getAccNum() {
     return accNum;
 }

 public double getBalance() {
     return balance;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }

 public Person getAccHolder() {
     return accHolder;
 }

 public void setAccHolder(Person accHolder) {
     this.accHolder = accHolder;
 }

 // Polymorphic withdraw method
 public boolean withdraw(double amount) {
     if (amount > 0 && (balance - amount >= 0)) {
         balance -= amount;
         System.out.println("Withdrew INR " + amount + " from account: " + accNum);
         return true;
     } else {
         System.out.println("Insufficient balance");
         return false;
     }
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited INR " + amount + " to account: " + accNum);
     } else {
         System.out.println("Invalid deposit amount");
     }
 }

 @Override
 public String toString() {
     return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
 }
}

//SavingsAccount Class
class SavingsAccount extends Account {
 private final double minimumBalance = 1000;

 public SavingsAccount(Person accHolder, double initialBalance) {
     super(accHolder, initialBalance);
 }

 // Override the withdraw method
 @Override
 public boolean withdraw(double amount) {
     if (getBalance() - amount >= minimumBalance) {
         setBalance(getBalance() - amount);
         System.out.println("Withdrew INR " + amount + " from Savings Account");
         return true;
     } else {
         System.out.println("Cannot withdraw: Minimum balance requirement not met.");
         return false;
     }
 }
}

//CurrentAccount Class
class CurrentAccount extends Account {
 private double overdraftLimit = 5000;

 public CurrentAccount(Person accHolder, double initialBalance) {
     super(accHolder, initialBalance);
 }

 // Override the withdraw method
 @Override
 public boolean withdraw(double amount) {
     if (getBalance() - amount >= -overdraftLimit) {
         setBalance(getBalance() - amount);
         System.out.println("Withdrew INR " + amount + " from Current Account");
         return true;
     } else {
         System.out.println("Cannot withdraw: Overdraft limit exceeded.");
         return false;
     }
 }
}

//Person Class
class Person {
 private String name;
 private float age;

 public Person(String name, float age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public float getAge() {
     return age;
 }

 public void setAge(float age) {
     this.age = age;
 }

 @Override
 public String toString() {
     return "Person [name=" + name + ", age=" + age + "]";
 }
}

//Main Class for testing polymorphism
public class Poly3 {
 public static void main(String[] args) {
     // Creating Persons
     Person smith = new Person("Smith", 30);
     Person kathy = new Person("Kathy", 28);

     // Creating accounts
     SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
     CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000);

     // Deposit
     smithAccount.deposit(2000);
     kathyAccount.deposit(1000);

     // Withdraw operations
     smithAccount.withdraw(2500); // Should work
     kathyAccount.withdraw(7000); // Should work due to overdraft

     // Polymorphism: using base class reference
     Account polyAccount1 = smithAccount;
     Account polyAccount2 = kathyAccount;

     polyAccount1.withdraw(1000); // Savings account withdrawal
     polyAccount2.withdraw(6000); // Current account withdrawal

     // Display updated balances
     System.out.println("Updated balance in Smith's account: " + smithAccount.getBalance());
     System.out.println("Updated balance in Kathy's account: " + kathyAccount.getBalance());

     System.out.println(smithAccount);
     System.out.println(kathyAccount);
 }
}



