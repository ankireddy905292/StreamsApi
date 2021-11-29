package com.stream;
import java.util.*;
public class StreamAddressBook {1
    public static void main(String[] args) {
        AddressBookManager makeBook = new AddressBookManager();
        makeBook.takeOption();
        boolean condition = true;
        while (condition) {
            boolean monitorUser = makeBook.takeOption();
            if (monitorUser)
                break;
        }
    }
}

