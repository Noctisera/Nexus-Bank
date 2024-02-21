package Users;

import Wallets.CryptoWallet;
import Wallets.EconomyWallet;
import Wallets.NormalWallet;

import java.util.Date;

public class User {
    /* Personal Data */
    private String forename; // Name chosen at birth
    private String surname; // Family name
    private String email;
    private String telephone;
    private Date dateOfBirth;
    /* Account Data */
    private String username;
    private String password; // Hashed
    /* Wallet Data */
    private NormalWallet[] normalWallets;
    private EconomyWallet[] economyWallets;
    private CryptoWallet[] cryptoWallets;

    public User(String forename, String surname, String email, String telephone, Date dateOfBirth, String username, String password) {
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.telephone = telephone;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        this.normalWallets = new NormalWallet[0];
        this.economyWallets = new EconomyWallet[0];
        this.cryptoWallets = new CryptoWallet[0];

        // Add a normal wallet by default

    }
}
