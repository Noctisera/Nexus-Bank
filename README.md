# Nexus-Bank

This is an on-going group project destined to simulate a banking app with as many functionalities as possible. The main goal is to build the backend for the app with small chances to also make the frontend after.

## Project Structure Plan

Once the app is running, the user should be met this the app interface that takes limited commands. The only things that can be done on the first page are registering and logging in.
Once a user is registered, it is added to the database and he can log in.

### Users

The app is dedicated only for the users. All users once registered are added to the data base.

### Wallets (SUBJECT MOSTLY TO CHANGE, SHOULD BE BUILD TO IMITATE MOST WALLET SYSTEMS FROM BANKING APPS)

Users when registered start with a main wallet with EUR currency. They can have the following virtual wallet types:
- Savings - Can only interact with the normal wallets of the same user. Can have multiple.
- Normal - Can interact with most ways of spending or getting money. Can have multiple.
- Crypto - Can only interact with normal wallets or transfering currency into crypto. Can have only one that can hold several different real or crypto currencies.

A wallet can only have of type of currency that is specified at its creation. The only exception are crypto wallets that should be able to hold multiple currencies at once (both crypto and normal currencies).

A user can choose options such freezing the wallet, or setting a maximum monthly spending limit.

### Currency

Several currencies should be possible (around 15-20 would be a modest number). Most likely will assign them static values.

If the project develops into something cooler, a live valute tracker could be implemented.

On all of our transfers we have 0 taxes.

### Transactions

### Payment history

All users will have a transaction history that they can access. The transaction history includes all actions that either take or deposit money in the account. Each wallet will have their own transaciton history and each account can see a transaction history of all their wallets combined.

### Application Pages (For the user interface)

#### The login page

The first page of the app. Here are the login and register options. Registering leads to the register page. Loging on successfully leads to the main page of the user.

#### The register page

Once the user is registered, go back to the login page.

#### The main page 
It will show the total value on all types of wallets: the sum of all savings, the sum of all normal wallets and the sum of all crypto wallets.
Below the revenue, there should be last two transactions followed by a button that leads to the page with all transactions from all cards.

#### The card selection page
It will show all personal wallets which can be interacted with to go on their individual page.
Below the wallets there is should be the "ADD NEW WALLET" option that leads to the wallet creation page.

#### Saving/Normal card page
It will have the options to show details (shows the wallet number, expiry date, CVV of the wallet), freeze, set monthly limit and show transaction history.
This is where transaction options should also be: either sending or requesting money from another wallet/bank account.

### Commands

Commands that make any changes in the database will be saved as logs using the Command Pattern.


