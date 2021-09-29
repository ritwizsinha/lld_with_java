package com.sinha.ritwiz;

import java.util.ArrayList;
import java.util.Locale;

public class Command {
     String[] params;

     public  Command(String command) {
         params = command.toLowerCase(Locale.ROOT).split(" ");
         if (params.length == 0) {
//             Throw exception
         }
     }

     public String getCommandName() {
         return this.params[0];
     }

     public int paramSize() {
         return this.params.length - 1;
     }
}
