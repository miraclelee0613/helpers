<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>;

let $movebtn = $(".movebtn");
let $dashul = $(".dashul");

$movebtn.on("mouseup", function () {
  $dashul.slideToggle();
});
