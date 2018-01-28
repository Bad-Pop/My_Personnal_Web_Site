import React, {Component} from 'react';

class Skills extends Component {
    render() {
        if(this.props.skills && this.props.skills.length > 0) {
            return (

                <div>
                    <h4 className="text-center">Mes competences</h4>

                    {
                        this.props.skills.map((item) =>
                            <div key={item.skillName}>
                                <p>{item.skillName}</p>
                                <div className="progress">
                                    <div className="progress-bar progress-bar-success" role="progressbar" aria-valuenow={item.masteryLevel}
                                         aria-valuemin="0" aria-valuemax="100" style={{width: item.masteryLevel + '%'}}>
                                    </div>
                                </div>
                            </div>
                        )
                    }
                </div>
            );
        } else {
            return (null);
        }
    }
}

export default Skills;