#  AES Android Test Application :
Description :
Pass in the plainText as String, Pass in the key as String, 
Pass in the IV as String.
Both the encrypted and decrypted data are also String. key is converted to 256-bit within the library for Android

# Android :

try {

    String plainText = "this is my plain text";
    String key = "simplekey";
    String iv = "1234123412341234";

    CryptLib cryptLib = new CryptLib();

    String encryptedString = cryptLib.encryptSimple(plainText, key, iv);
    System.out.println("encryptedString " + encryptedString);

    String decryptedString = cryptLib.decryptSimple(encryptedString, key, iv);
    System.out.println("decryptedString " + decryptedString);
    }
    catch (Exception e) { e.printStackTrace();}

# Output :

encryptedString rKzNsa7Qzk9TExJ6aHg49tGDiritTUJ08RMPm48S0o4=

decryptedString this is my plain text
