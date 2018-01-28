import React, { Component } from 'react';

import Loading from '../../assets/images/loading.gif';

class AjaxLoading extends Component{

    render() {
        return (
            <div className="loading">
                <img src={Loading} alt="Chargement en cours ..." className="center-block img-responsive"/>
            </div>
        );
    }

}
export default AjaxLoading;