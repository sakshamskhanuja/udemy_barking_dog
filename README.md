## Barking Dog

### Description

We have a dog that likes to bark.  We need to wake up if the dog is barking at night! Write a method <b>shouldWakeUp</b> that has 2 parameters.

1st parameter should be of type <b>boolean</b> and be named <b>barking</b> it represents if our dog is currently barking. 2nd parameter represents the hour of the day and is of type <b>int</b> with the name <b>hourOfDay</b> and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return <b>true</b>. In all other cases return <b>false</b>. If the <b>hourOfDay</b> parameter is less than 0 or greater than 23 return <b>false</b>.


### Examples of input/output

<ul>
<li>shouldWakeUp (true, 1); → should return <b>true</b></li>
<li>shouldWakeUp (false, 2); → should return <b>false</b> since the dog is not barking.</li>
<li>shouldWakeUp (true, 8); → should return <b>false</b>, since it's not before 8.</li>
<li>shouldWakeUp (true, -1); → should return <b>false</b> since the <b>hourOfDay</b> parameter needs to be in a range 0-23.</li>
</ul>
