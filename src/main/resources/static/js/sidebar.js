/* Set the width of the sidebar to 250px and the left margin of the page content to 250px or viewport width on small
 * screens
 */
function openNav() {
    if(isWindowSmall()){
        $("#sidebar").width("100vw");
        $("#main").css("marginLeft" , "100vw");
    } else {
        $("#sidebar").width("250px");
        $("#main").css("marginLeft" , "250px");
    }
    $(".openbtn").hide();
}

/* Set the width of the sidebar to 0 and the left margin of the page content to 0 */
function closeNav() {
  $("#sidebar").width("0");
  $("#main").css("marginLeft" , "0");
  $(".openbtn").show();
}

/* Open the sidebar if the page is big enough */
$( document ).ready(function() {
    if (!isWindowSmall()) {
        openNav();
    }
});

function isWindowSmall() {
    const mq = window.matchMedia( "(max-width: 720px)" );
    return mq.matches;
}