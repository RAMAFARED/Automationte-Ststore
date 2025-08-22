# 🛒 Automation Test Store – Selenium Test Project

## 1️⃣ Overview  
This project is an **Automation Testing framework** built using **Selenium WebDriver (Java)** and **TestNG**.  
It automates different scenarios on the website [Automation Test Store](https://www.automationteststore.com/), including:  
- Creating a new account with random data  
- Logging in with the generated account  
- Selecting random products and adding them to the cart  
- Handling cases of items being **out of stock**  
- Completing checkout for available items  

---

## 2️⃣ Technologies Used  
- **Java** (Programming Language)  
- **Selenium WebDriver** (Automation Tool)  
- **TestNG** (Test Framework)  
- **ChromeDriver** (Browser Driver)  

---

## 3️⃣ Project Structure  
- **packagee.Midc** → Main test class that contains all test cases.  
- **@BeforeTest** → Setup method (opens the browser, navigates to website, maximizes window).  
- **@Test (priority = …)** → Test cases executed in order.  

---

## 4️⃣ Test Scenarios  
### (a) Sign Up (SinUp)  
- Opens "Login or Register" page.  
- Fills the registration form with **random first/last name, email, and username**.  
- Selects country & region.  
- Submits the form and logs out.  

### (b) Login Test  
- Logs in using the **previously generated username**.  
- Verifies successful login.  

### (c) Random Items  
- Navigates to a category.  
- Picks a random product from the list.  
- Sets a **random quantity** (between 9–14).  
- Adds the product to the cart and proceeds to checkout.  

### (d) Random Items + Out of Stock Handling  
- Navigates to Men’s category.  
- Picks a random product.  
- If **Out of Stock** → prints `"No Stock"` and refreshes the category.  
- If available → selects random quantity, adds to cart, proceeds to checkout, and prints `"Your Order Has Been Processed!"`.  

---

## 5️⃣ Key Features  
- **Random Data Generation** → Different test data each run.  
- **Dynamic Product Selection** → Random product & quantity ensures test variability.  
- **Error Handling** → Detects and handles out-of-stock products gracefully.  
- **End-to-End Flow** → Covers full e-commerce cycle (Sign up → Login → Add to Cart → Checkout).  

---

## 6️⃣ How to Run  
1. Clone this repository.  
2. Install **Java + TestNG + Selenium**.  
3. Download the latest **ChromeDriver** compatible with your browser.  
4. Open the project in **Eclipse/IntelliJ**.  
5. Run the `Midc.java` test class.  

---

## 7️⃣ Example Output

No Stock
Your Order Has Been Processed!


---

✨ This project demonstrates **automation testing in real-life scenarios**, combining **data-driven testing** with **randomization** for stronger test coverage.  


## 7️⃣ Example Output  
