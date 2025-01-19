
(function ($){
    "use strict";

    var registry = $(window).adaptTo("foundation-registry");

    registry.register("foundation.validation.validator", {
        selector: "[data-validation = custom-productName-validation]",

        validate: function (el){
            const inputField = $(".cmp-productName")
            const value = inputField.val();

            if (!value.match(/^[a-zA-Z]+$/)){
                return "Invalid characters!";
            }
        }

    });
})(jQuery);