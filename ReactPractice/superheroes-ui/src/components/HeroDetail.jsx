import { React, useEffect, useState } from 'react'
import images from "../index"
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
// import React, { useEffect, useState } from "react";
import { Row, Col } from 'react-bootstrap';


const HeroDetail = (props) => {
  const[counter, setCounter] = useState(0);
  const incrementCounter =()=>{
    setCounter(counter+1);
}
  return (
    <Card >
    <div className="imgContainer">
      <Card.Img variant="top" src={images[props.info.alias.replaceAll(/\s/g, '')]} width="150px" />
    </div>
    <Card.Body >
      <Card.Title >Alias: {props.info.alias}</Card.Title>
      <Card.Text >Name: {props.info.name}</Card.Text>
      {/* <Card.Text>Likes: {counter}</Card.Text> */}
      {/* <Button variant="primary" onClick={incrementCounter}>Like</Button> */}
      <Row>
      <Col>{counter > 0  && <Card.Text >Likes: {counter}</Card.Text > }</Col>
  <Col><Button variant="primary" onClick={incrementCounter}>Like</Button></Col>
  </Row>
    </Card.Body>
  </Card>
  )
}

export default HeroDetail