import $ from 'jquery';

export const apiUrl = "http://localhost:8080/api";

export const SideBarInfo = {
    title: "Alexis Vachard",
    job: "Développeur",
    localization: "France, Ile de France",
};

export function ajaxSetup() {
    $.ajaxSetup({
        contentType: "application/json; charset=utf-8",
        crossDomain: true,
        dataType: "json"
    });
}