
var gostButton= document.getElementById('gost-button');
var pResult= document.getElementById('result');
var text= 'Да будет текст';
var selectedSource;
var typeOfDocument;
function ISchecked(name){
        var elements = document.getElementsByName(name);
        for (var i=0; i<elements.length; i++)  {
        if  (elements[i].checked)
            return elements[i];
         }

}



gostButton.addEventListener('click',function (evt) {
    evt.preventDefault();
    gostButton.classList.add('color-red');


     selectedSource = ISchecked("book-type");

    if (selectedSource.hasAttributes()) {
        typeOfDocument = selectedSource.getAttribute("value");

    }

    var authors = document.getElementById('author').value;
    var sourse = document.getElementById('sourse').value;
    var publishingHouse = document.getElementById('publishing-house').value;
    var yearOfPublication = document.getElementById('year-of-publication').value;
    var page = document.getElementById('page').value;
    var dayMonthOfPublication = document.getElementById('day-month-of-publication').value;
    var urlOfPpublication = document.getElementById('url-of-publication').value;


    switch (typeOfDocument) {
        case "book":
            text = "было выбрано book";
            break;
        case "legal-act":
            text = " было выбрано legal-act";
            break;
        case "standards":
            text = "было выбрано book";
            break;
        case "deposited-scientific-papers":
            text = "было выбрано book";
            break;
        case "thesis":
            text = "было выбрано book";
            break;
        case "abstract-of-thesis":
            text = "было выбрано book";
            break;
        case "research-reports":
            text = "было выбрано book";
            break;
        case "electronic-resource":
            text = "было выбрано book";
            break;
        case "article":
            text = "было выбрано book";
            break;
    }




    function bookCase(authors, source, publishingHouse,yearOfPublication,page){
        var authorsArray = authors.split(",")

    }
    pResult.innerText= text ;


});
