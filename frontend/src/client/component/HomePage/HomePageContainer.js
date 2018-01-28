import React, {Component} from 'react';
import $ from 'jquery';

import {ajaxSetup, apiUrl} from "../../config/config";
import Sidebar from './Sidebar';
import Skills from './Skills';
import PersonnalDescription from './PersonnalDescription';
import Diplomas from './Diplomas';
import Experiences from './Experiences';
import AjaxLoading from '../../../component/AjaxLoading/AjaxLoading';

import '../../assets/css/HomePageContainer.css';

class HomePageContainer extends Component {

    state = {
        homePage: {
            skills: [],
            diplomas: [],
            professionnalExperiences: []
        },
        error: {
            error: "",
            stackTrace: ""
        },
        // showLoading: false
    };

    constructor(props) {
        super(props);
        this.ajaxSetup = ajaxSetup;
    }

    componentWillMount() {
        const ctx = this;
        this.setState({showLoading: true});
        $.ajax({
            type: "GET",
            url: apiUrl + "/homepage",
            success: function (response) {
                if (response.error) {
                    ctx.setState({
                        error: response
                    })
                } else {
                    ctx.setState({
                        homePage: response
                    });
                }
                ctx.setState({showLoading: false});
            }
        });
    }

    render() {
        return(
            <div className="content">
                {/*SideBar*/}
                <div className="col-xs-12 col-sm-12 col-md-3 col-lg-3">
                    <Sidebar/>
                    <div className="spacer"/>
                    <div className="hidden-xs hidden-sm">
                        {
                            this.state.homePage.skills && this.state.homePage.skills.length > 0
                                ?
                                <Skills skills={this.state.homePage.skills}/>
                                :
                                null
                        }
                    </div>
                </div>
                {/*Content*/}
                <div className="col-xs-12 col-sm-12 col-md-9 col-lg-9">
                    <PersonnalDescription/>
                    <Experiences experiences={this.state.homePage.professionalExperiences}/>
                    <Diplomas/>
                </div>
                <div className="hidden-md hidden-lg col-xs-12 col-sm-12">
                    {
                        this.state.homePage.skills && this.state.homePage.skills.length > 0
                            ?
                            <Skills skills={this.state.homePage.skills}/>
                            :
                            null
                    }
                </div>
            </div>
        );
    }
}

export default HomePageContainer;