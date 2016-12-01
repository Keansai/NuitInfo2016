$(document).ready(function(){
    $.ajax({
        type: 'get',
        url:'questionnaire.xml',
        dataType:'xml',
        success:function(data){
            var question;
            question = $(data).find('q1').text();
            $('input').attr('placeholder', question);
            //alert(question);
        }
    });
});