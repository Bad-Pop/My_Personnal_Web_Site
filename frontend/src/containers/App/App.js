import React, {Component} from 'react';
import {BrowserRouter, Switch, Route} from 'react-router-dom';

import HomePageContainer from '../../client/component/HomePage/HomePageContainer';
import NotFound from '../../component/NotFound/NotFound';

import '../../assets/css/general.css';
import '../../assets/css/bootstrap.min.css';
import '../../assets/css/font-awesome.min.css';

class App extends Component {
    render() {
        return (
            <BrowserRouter>
                <div>
                    <div className="container">
                        <Switch>
                            <Route exact path="/" component={HomePageContainer}/>
                            <Route component={NotFound}/>
                        </Switch>
                    </div>
                </div>
            </BrowserRouter>
        );
    }
}

export default App;