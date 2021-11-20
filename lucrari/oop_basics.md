
1. Creați un repositoriu privat ``task201121`` și deschideți acces pentru ``sergiuchilat`` (1)
2. Creați o clasă(conform variantei) cu cîte o proprietate: publică, protejată și privată (2)
3. Creați getterii și setterii necesari pentru a face posibil accesul la toate proprietățile clasei (2)
4. Rescrieți metoda toString a clasei, pentru a afișa toate proprietățile clasei în format JSON (1)
5. Adăugați în clasă 3 constructori(vor fi diferențiați după numărul de parametrii sau după tipul lor de date) (1)
  
  Ex: Designer cu salariul 1000, Designer cu salariul 1000 și regim de lucru fulltime, Designer la care nu este specificat salariul sau regimul de lucru.

7. Creați o clasă abstractă, care ar putea fi părintele clasei pe care ați creat-o anterior (2).
  
  Ex: Pentru clasa Designer, clasa părinte va fi Employee

8. Creați o clasă înrudită cu clasa din varianta pe care o aveți, iar codul care le este comun, va fi transferat în clasa părinte abstractă (2)
  
  Ex: Pentru clasa Designer, clasa înrudită va fi Programmer

10. De realizat un scenariu care va conține cel puțin 10 de operații (5)
  
  Ex: 
  + creăm un Programmer cu salariul 1200, regim de lucru 8 ore
  + creăm un Designer cu salariul 1000, regim de lucru 8 ore
  + verificăm al cui salariu este mai mare și afișăm ”Salriu Programmer = 1200, Salariu Designer = 1000, Diferenta = 200 în favoarea Programmer”
  + creștem salariul pentru Designer cu 20%
  + creștem salariul pentru Programmer cu 5%
  + verificăm al cui salariu este mai mare și afișăm ”Salriu Programmer = ???, Salariu Designer = ???, Diferenta = ??? în favoarea ???”
  + pentru angajatul al cărui salariu este mai mic, micșorăm regimul de lucru cu 1 oră 
  + angajatului care lucrează pe 7 ore îi micșorăm și salariul cu 3%
  + ...

12. De creat o interfață care permite acces doar la o metodă a clasei (1)
13. De creat o instanță a clasei bazate pe această interfață și de apelat metoda din interfață (1)
14. Executați codul, faceți screenshoot-uri li pe încprcați în repozitoriu, în mapa ”screens” (1)
15. Trebuie de facut un commit pentru fiecare însărcinare (1)



Variante:
1. Car: name, engineType, maxSpeed
2. Bus: number, color, maxPlaces
3. Rabbit: name, age, type
4. Train: routeName, maxPassengers, color
5. Employee: idnp, name, salary
6. PC: brand, ramSize, price
7. Phone: brand, color, price
8. Bank Account: number, totalMoney, ownerName
9. Student: name, group, averageMark
10. Company: name, website, totalEmployees
11. Store: name, address, totalProducts
12. Monitor(screen): brand, resolution
13. Teacher: name, school, experience(in years)
14. Fish: species, weight, age(years)
15. POS terminal: number, storeName, casInForDay
16. Pupil: name, class, averageMark
17. User: email. password, phone
18. Product: name, price, weight
19. Butterfly: type, color, age(in days)
