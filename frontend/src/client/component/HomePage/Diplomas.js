import React, {Component} from 'react';

import '../../assets/css/cards.css'

class Diplomas extends Component {
    render() {
        return (
            <div>
                <div className="spacer"/>
                <h1>Diplomes et formationss</h1>
                <div className="row">
                    <div className="card">
                        <div className="wrapper">
                            <div className="header">
                                <div className="date">
                                    <span className="year">2017 - 2019</span>
                                </div>
                            </div>
                            <div className="data">
                                <div className="content">
                                    <h1 className="title">expert informatique et systeme d'information</h1>
                                    <p className="text">École privée des sciences informatiques, Levallois Perret</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="card">
                        <div className="wrapper">
                            <div className="header">
                                <div className="date">
                                    <span className="year">2016 - 2017</span>
                                </div>
                            </div>
                            <div className="data">
                                <div className="content">
                                    <h1 className="title">Bachelor informatique</h1>
                                    <p className="text">École privée des sciences informatiques, Levallois Perret</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="row">
                    <div className="card">
                        <div className="wrapper">
                            <div className="header">
                                <div className="date">
                                    <span className="year">2014 - 2016</span>
                                </div>
                            </div>
                            <div className="data">
                                <div className="content">
                                    <h1 className="title">BTS SIO option SLAM</h1>
                                    <p className="text">Lycée Savary de Mauléon, les sables d'olonne</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="card">
                        <div className="wrapper">
                            <div className="header">
                                <div className="date">
                                    <span className="year">2011 - 2014</span>
                                </div>
                            </div>
                            <div className="data">
                                <div className="content">
                                    <h1 className="title">Baccalaureat ES</h1>
                                    <p className="text">Lycée Savary de Mauléon, les sables d'olonne</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Diplomas;