# Nexus-Bank

This is an on-going group project destined to simulate a banking app with as many functionalities as possible. The main goal is to build the backend for the app with small chances to also make the frontend after.

## Project Structure Plan

Once the app is running, the user should be met this the app interface that takes limited commands. The only things that can be done on the first page are registering and logging in.
Once a user is registered, it is added to the database and he can log in.

### Users

The types of users used will be:
- Main Admin - All privileges. There can never be two main admins. Can create secondary admin accounts.
- Secondary Admins - Less privileges (To be decided after all commands are planned)
- Users - The customer accounts
That means the accounts should be implemented along with permissions.

### Wallets (SUBJECT MOSTLY TO CHANGE, SHOULD BE BUILD TO IMITATE MOST WALLET SYSTEMS FROM BANKING APPS)

Users when registered start with a main wallet with EUR currency. They can have multiple of the following virtual wallet types:
- Savings - Can only interact with the normal wallets of the same user.
- Normal - Can interact with most ways of spending or getting money.
- Crypto - Can only interact with normal wallets or transfering currency into crypto.

A wallet can only have of type of currency that is specified at its creation. Holding multiple currencies implies having multiple wallets. The only exception to this are crypto wallets that should be able to hold multiple currencies at once (mostly crypto currencies).

### Currency

Several currencies should be possible (around 15-20 would be a modest number). Most likely will assign them static values.

If we project develops into something cooler, a live valute tracker could be implemented.

On all of our transfers we have 0 taxes.

### Commands

Commands that make any changes in the database will be saved as logs using the Command Pattern.


