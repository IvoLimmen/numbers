# Numbers

## Why? What?

I have this large poster on my toilet door.
A multiplication table for 1 to 10.
It has been hanging there for like 10 years?
Yeah; I have been meaning to remove it.
Every time I take a shit I see the poster.
Every time I see it I wonder about the fact that there are tables where each digit is represented as last digit in the result.
You only see this in the numbers 1, 3, 7 and 9.
So it is now shown on just uneven numbers.
I wanted to know more about it so I wrote this.
This shows all the tables that have this property for all tables from 0 to 100.

## Conclusion

Well it was fun writing this, that is for sure.
The numbers that have these properties are not prime numbers.
The numbers that have these properties are numbers that end in 1, 3, 7 and 9.
And that technically makes this recusive?

## Running this your self

### Requirements

* Maven 4
* JDK 21

(use sdkman for ease of use)

### Build

`mvn clean install`

### Run

`java -cp target/numbers-1.0-SNAPSHOT.jar org.limmen.test.numbers.Main`