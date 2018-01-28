import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class NotFound extends Component {
    render() {
        return (
            <div>
                <h1>allo houston ! on a un probleme</h1>
                <h2>Erreur 404 - Page introuvable</h2>
                <Link to={"/"}>
                    <button type="button" className="btn btn-danger">Retourner à l'accueil</button>
                </Link>
            </div>
        );
    }
}
export default NotFound;