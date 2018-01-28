import React, {Component} from 'react';

import {SideBarInfo} from '../../config/config';

import myPhoto from '../../../assets/images/me.jpg';

class Sidebar extends Component {
    render() {
        return (
            <div className="center-block text-center">
                <img src={myPhoto} alt="me" className="img img-responsive image-sidebar center-block img-thumbnail"/>
                <h2 className="text-center">{SideBarInfo.title}</h2>
                <p>
                    {SideBarInfo.job}
                </p>
                <p className="small">
                    <i className="fa fa-globe" aria-hidden="true"/> {SideBarInfo.localization}
                </p>
                <hr/>
                <ul className="list-inline">
                    <li>
                        <h3>
                            <a href="https://www.linkedin.com/in/alexis-vachard-123552109/" target="_blank" rel="noopener noreferrer" className="social-contact">
                                <i className="fa fa-linkedin" aria-hidden="true"/>
                            </a>
                        </h3>
                    </li>
                    <li>
                        <h3>
                            <a href="https://twitter.com/Bad_P0p" target="_blank" rel="noopener noreferrer" className="social-contact">
                                <i className="fa fa-twitter" aria-hidden="true"/>
                            </a>
                        </h3>
                    </li>
                    <li>
                        <h3>
                            <a href="https://github.com/Bad-Pop" target="_blank" rel="noopener noreferrer" className="social-contact">
                                <i className="fa fa-github" aria-hidden="true"/>
                            </a>
                        </h3>
                    </li>
                </ul>
            </div>
        );
    }
}

export default Sidebar;