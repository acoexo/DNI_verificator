# DNI VERIFICATOR
:::info
10/02/2023
:::
## Instalation
Only you need a JVM and copy or download the ***.java*** file and open it in your IDE or you can execute directly on the cmd with the command **"javac" *-filename*** and **"java" *-filename***
## Usage
A mesage on the input console will apear, the program asks you to enter a DNI (Nacional Identity Document in spanish)
:::warning
:warning: Only works on spanish DNI's
:::
You need to input the DNI code that appear under the ID photo
![](https://i.imgur.com/Vwb5qir.jpg)
:::info
Not in all versions of DNI's, the identification number is bellow the ID photo
:::
Next, press enter and the program will start doing calcs

## How it works
### The metod to calculate the corresponding letter on the DNI
To calculate the letter which correspond to the DNI is taking the numbers, for example "99999999R", take only "99999999" and divide it by 23
### What to do now
![](https://i.imgur.com/y43KSoL.png)

On this table we have the rests of the division above to letters, each rest have asigned one letter, for example "99999999" divided by 23 returns as rest 1
Looking on the tale, rest 1 correspond with the leeter "R" so, the sample of dni on usage section of this manual, is a valid DNI.


## Output
The output contains the conclusion, corresponds or no. 

![](https://i.imgur.com/ia8MZFv.png)

Also, for developers, contains a pseudo debugger like this

![](https://i.imgur.com/nurpoUU.png)
