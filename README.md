# Automatizacija Zadatak
## Preduvjeti
Da bismo mogli skinuti i odvrtiti testove na Vašem racunalu potrebno je imati instalirane 2 stvari:  
**1. JAVA JDK**  
- Možete provjeriti da li imate instaliranu Javu sljedecom naredbom u vašoj konzoli:  
> javac -version  
Ukoliko dobijete ispis java compiler verzije ne trebate instalirati JDK, u suprotnome link za instlaciju JDK-a za windows je [ovdje](https://devwithus.com/install-java-windows-10/).  
**1. Maven**  
- Možete provjeriti da li imate instaliran Maven na racunalu sljedecom naredbom u vašoj konzoli:  
> mvn -version  
Ukoliko dobijete ispis neke Apache Maven verzije znaci da je instaliran, u suprotnome link za instalaciju Maven-a za windows je [ovdje](https://mkyong.com/maven/how-to-install-maven-in-windows).

## Preuzimanje zadatka
Jedan od jednostavnijih nacina za preuzimanje zadatka je da na ovoj github stranici projekta kliknete na zeleni botun "Code" otvorit ce vam se sekcija sa nekoliko opcija za skidanje, najjednostavniji nacin je samo kopirati taj predloženi url: https://github.com/ivanpocrnja/Automation-zadatak.git  
Zatim na svom racunalu otvorite konzolu na mjestu gdje želite dodati projekt i u konzolu upišete:  > git clone "taj url"

## Pokretanje zadatka (Automatizacije)
Zadatak možemo pokrenuti na 2 načina:  
**1.Pokretanje testova iz konzole**  
- Uđite u projektni folder te iz istoga otvorite konzolu.
- u konzolu upišite sljedecu naredbu:  
> mvn clean install  
> 
Nakon što test završi izgenerirat ce Vam se report koju nam nudi cucumber, koju takoder možete vidjeti u target/HtmlReports/report.html (Ovaj fajl otvorite u browseru te cete dobiti još više         informacija o samom Test case-u).  

**2.Otvorite projekt u IDE-U(npr. IntelliJ)**
- Uđite u src/test/java/stepDefinitions/TestRunner.java klasu
- desni klik run 'TestRunner.java'

Pokrenuti će se testovi te će te ishod moći vidjeti u konzoli IDE-a, te također u target/HtmlReports/report.html (Ovaj fajl opet otvorite u browseru za više detalja oko izvršenih test case-ova.).

          
