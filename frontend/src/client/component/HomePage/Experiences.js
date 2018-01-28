import React, {Component} from 'react';

import '../../assets/css/Experiences.css';

class Experiences extends Component {

    state = {
        experiences: []
    };

    componentWillReceiveProps(nextProps){
        this.setState({
            experiences: nextProps.experiences
        });
    }

    render() {
        return (
            <div>
                <div className="spacer"/>
                <h1>experiences professionnelles</h1>
                {
                    this.state.experiences.map((item)=>
                        <div className="experience col-xs-12" key={item.id}>
                            <div className="col-xs-3 text-center">
                                <img src={item.companyLogo} alt="company logo" className="img-responsive center-block"/>
                            </div>
                            <div className="col-xs-9">
                                <p className="job-title">{item.jobTitle}</p>
                                <p>{item.company}</p>
                                {
                                    item.endDate
                                    ?
                                        <p>{item.startDate} à {item.endDate}</p>
                                    :
                                        <p>{item.startDate} à aujourd'hui</p>
                                }
                                <p className="small">
                                    <i className="fa fa-globe" aria-hidden="true"/> {item.missionPlace}
                                </p>
                            </div>
                        </div>
                    )
                }
            </div>
        );
    }
}

export default Experiences;