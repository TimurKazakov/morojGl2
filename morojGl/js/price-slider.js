var elm = document.querySelector('catalog-main__form__price__range');
var container = elm.parentNode;
var values = elm.getAttribute('data-values').split(' ');

values.forEach(function (value, i, values) {
    var rangePart = elm.cloneNode();
    rangePart.type = 'range';
    rangePart.removeAttribute('data-values');
    rangePart.value = value;
    rangePart = container.insertBefore(rangePart, elm);
});

elm.remove();