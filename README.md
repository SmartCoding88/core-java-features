# core-java-features

<h2>Features</h2>
<ul>
    <li>Most popular programming language since 1996 (SUN MICROSYSTEMS)</li>
    <li>Can be used for small to entreprise applications</li>
    <li>Based on C++</li>
    <li><b>Cross-platform:</b> Write Once, Run anywhere</li>
    <li>Object-oriented language</li>
    <li>Platform independent</li>
    <li>Compiled and Interpreted</li>
    <li>Simple, Robust and Secure</li>
    <li>Multithreaded</li>
    <li>Dynamic</li>
</ul>
<h2>Loops</h2>
<p>While(booleanExpression){ statement(s) }</p>
<p>do{ statement(s) } While(Boolean Expression);
<p>For(int index=0; index < 20; index++){ statement(s) }</p>
<p><b style="color:red">Break</b> statement is used to breal from an enclosing <u>for</u>, <u>while</u>, <u>do</u> and switch statement</p>
<p><b style="color:red">Continue</b> statement is like Break but it stops only the execution of current statement and causes control to return to next iteration</p>
<h2>Encapsulation</h2>
<p>It is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. </p>
<h2>Access Control modifiers</h2>
<ul>
    <li>Public</li>
    <li>Private</li>
    <li>Protected</li>
    <li>Default</li>
</ul>
<p>Static members are class level members. <br/> They don't need an already existing object to be used.</p>
<h2>Method Overloading</h2>
<p>Same method names in a class having different arguments. <br/>
<strong>Examples:</strong>
<ol>
    <li>
    public double calculatePerimeter(float width, float height){ return (width+height)*2; }
    </li>
    <li>
    public double calculatePerimeter(float width){ return width*4; }
    </li>
</ol>
</p>
<h2>Inheritance</h2>
<p>Make a class (Sub Class) inherit from another class called (Super Class) using "extends" keyword.</p>
<p>Used to avoid redundancy and avoid duplication</p>
<p>No multiple inheritance in JAVA</p>
<p>Within a package, a sub class can access all non-private members of super class.</p>
<p>Outside package, only public and protected members could be accessed by a sub class.</p>
<p>Use "final" keyword to prevent method overriding</p>