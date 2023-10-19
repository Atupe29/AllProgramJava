1//Given by RBI. RBI declared methods for Bank business
        interface Bank {
           void deposit();
           void withdraw();
           void balanceEnquiry();
           void transferFunds();
        }

        //inheritance - implementing functionality
        class HDFCBank implements Bank{
           void deposit() {
              --- HDFC bank depoist operation implementation
           }
           void withdraw(){
              --- HDFC bank withdraw operation implementation
           }
           void balanceEnquiry(){
              --- HDFC bank balanceEnquiry operation implementation
           }
           void transferFunds(){
              --- HDFC bank transferFunds operation implementation
           }
        }

        //Inheritance - extends functionality
        class SRNagarHDFCBank extends HDFCBank {
              ---- becomes sub type and
              ---- Reusing existing implementation
        }

        class AmeerpetHDFCBank extends HDFCBank {
             ---- becomes sub type and

           void deposit() {
              --- Overriding["CHANGING"] deposit operation implementation according ameerpet business
           }
        }


        class KukatpallyHDFCBank extends HDFC {
            ---- becomes sub type and

           void deposit() {
              --- HDFCBank logic + own logic
                   |-> Overriding and extending the functionality of deposit()
                   operation as per Kukatpally business

           }
        }