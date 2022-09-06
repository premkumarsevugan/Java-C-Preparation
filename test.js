function callback(){
    console.log("this is call back method");
}
function Test(fn){
    console.log("printing the call back method");
    fn();
    console.log("the call back method was printed Success fully");
}
Test(callback);
