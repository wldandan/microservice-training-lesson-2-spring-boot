@RestController
class WebApp{
    @RequestMapping("/")
    String greetings(){
        "Greetings from spring boot"
   }
}